package com.salesianostriana.classmatic.seguridad;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    //Manejador
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException {
        String targetUrl = determineTargetUrl(authentication);

        if (response.isCommitted()) {
            System.out.println("Can't redirect");
            return;
        }

        redirectStrategy.sendRedirect(request, response, targetUrl);
    }

    //Asignacion de rutas
    protected String determineTargetUrl(Authentication authentication) {
        String url = "";

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        List<String> roles = new ArrayList<String>();

        for (GrantedAuthority a : authorities) {
            roles.add(a.getAuthority());
        }

        if (isAlumno(roles)) {
            url = "/alumno/alumnoIni";
        } else if (isProfesor(roles)) {
            url = "/profesor/profesorIni";
        } else if(isJf(roles)){
            url="/jf/adminInicio";
        } else{
            url = "/acceso-denegado";
        }

        return url;
    }

    //Comprobadores del rol
    private boolean isAlumno(List<String> roles) {
        if (roles.contains("ROLE_ALUMNO")) {
            return true;
        }
        return false;
    }

    private boolean isProfesor(List<String> roles) {
        if (roles.contains("ROLE_PROFESOR")) {
            return true;
        }
        return false;
    }

    private boolean isJf(List<String> roles) {
        if (roles.contains("ROLE_JF")) {
            return true;
        }
        return false;
    }

    //Getters y Setters

    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }

    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }

}

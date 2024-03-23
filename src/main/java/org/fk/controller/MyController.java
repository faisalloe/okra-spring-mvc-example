package org.fk.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class MyController {

    @RequestMapping(value = "/user-detail")
    public String userDetail(OAuth2AuthenticationToken token, Model model) {
        Map<String, Object> attribs = token.getPrincipal().getAttributes();
        model.addAttribute("userName", attribs.get("name"));
        List<String> authorities = token.getPrincipal().getAuthorities().stream().map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());
        model.addAttribute("authorities", authorities);
        return "userDetail";
    }


}

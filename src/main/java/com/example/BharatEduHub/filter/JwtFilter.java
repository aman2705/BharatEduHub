//package com.example.BharatEduHub.filter;
//
//import com.example.BharatEduHub.Service.UserService;
//import com.example.BharatEduHub.util.JwtTokenUtil;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//
//@Component
//public class JwtFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//
//
//        String authorizationheader=request.getHeader("Authorization");
//        String token=null;
//        String userName=null;
//
//        if(authorizationheader!=null && authorizationheader.startsWith("Bearer ")){
//            token=authorizationheader.substring(7);
//            userName=jwtTokenUtil.extractUsername(token);
//        }
//
//        if(userName!=null && SecurityContextHolder.getContext().getAuthentication()==null){
//
//            UserDetails userDetails=userService.loadUserByUsername(userName);
//            if(jwtTokenUtil.validateToken(token,userDetails)){
//
//                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=
//                        new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
//                usernamePasswordAuthenticationToken
//                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//
//            }
//
//        }
//        filterChain.doFilter(request,response);
//
//    }
//}

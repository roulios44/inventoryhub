// package com.inventoryhub.inventoryhub.config;

// import java.io.IOException;

// import javax.crypto.SecretKey;

// import org.springframework.stereotype.Component;
// import org.springframework.web.filter.OncePerRequestFilter;

// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import jakarta.servlet.FilterChain;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// @Component
// public class JwtFilter extends OncePerRequestFilter {

//     private final SecretKey secretKey = JwtUtil.getSecretKey();

//     @Override
//     protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//             throws ServletException, IOException {
//         String header = request.getHeader("Authorization");
//         if (header != null && header.startsWith("Bearer ")) {
//             String token = header.substring(7);
//             try {
//                 System.out.println("IN the try ");
//                 Claims claims = Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).getBody();
//                 System.out.println(claims);
//                 System.out.println("After claim");
//                 // Vérifiez les réclamations et définissez l'authentification dans le contexte de sécurité
//             } catch (io.jsonwebtoken.security.SignatureException e) {
//                 // Gérer le cas où la signature ne correspond pas
//                 response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid JWT signature");
//                 System.out.println(response.toString());
//                 return;
//             }
//         }
//         filterChain.doFilter(request, response);
//     }
// }

package com.security.demo.controller.post.dto;

import com.security.demo.domain.post.Post;
import com.security.demo.domain.user.ApplicationUser;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@NoArgsConstructor
public class PostReadResponseDto {

    private String title;
    private String content;
    private String nickname;

    @Builder
    public PostReadResponseDto(String title, String content, String nickname) {
        this.title = title;
        this.content = content;
        this.nickname = nickname;
    }
}

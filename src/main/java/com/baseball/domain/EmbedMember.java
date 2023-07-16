package com.baseball.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class EmbedMember {
        private Long id;
        private String userid;
        private String name;
        private String email;
        private String password;
        private String githubLink;
}

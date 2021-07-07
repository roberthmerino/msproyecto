package com.project.web.ms.controller;

import java.util.*;

import lombok.*;

@Getter @Setter @Builder
public class ErrorMessage {
    private String code ;
    private List<Map<String, String >> messages ;
}

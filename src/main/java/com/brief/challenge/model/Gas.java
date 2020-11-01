package com.brief.challenge.model;

import lombok.Data;

import java.util.List;

@Data
public class Gas {
    private Pagination pagination;
    private List<Station> results;
}
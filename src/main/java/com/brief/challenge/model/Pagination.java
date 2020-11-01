package com.brief.challenge.model;

import lombok.Data;

@Data
public class Pagination {
    private int pageSize;
    private int page;
    private int total;
}

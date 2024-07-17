package com.justsmile.stock.domain;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public record RandomStock(String stockName, BigDecimal stockPrice) {

}

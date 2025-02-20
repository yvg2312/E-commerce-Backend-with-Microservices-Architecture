package com.hoangtien2k3.tax.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract class AbstractCircuitBreakFallbackHandler {

    protected void handleBodilessFallback(Throwable throwable) throws Throwable {
        handleError(throwable);
    }

    protected <T> T handleTypedFallback(Throwable throwable) throws Throwable {
        handleError(throwable);
        return null;
    }

    private void handleError(Throwable throwable) throws Throwable {
        log.error("Circuit breaker records an error. Detail {}", throwable.getMessage());
        throw throwable;
    }
}

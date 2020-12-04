package com.simfle.maltee.exception;

public class OrderException {
    public enum OrderErrorCode {
        ORDER_NOT_EXISTS(90),
        ORDER_EXISTS(91);

        private final int code;

        private OrderErrorCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}

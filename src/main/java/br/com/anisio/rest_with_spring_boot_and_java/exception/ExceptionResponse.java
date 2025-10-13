package br.com.anisio.rest_with_spring_boot_and_java.exception;

import java.util.Date;

public record ExceptionResponse(Date timstamp, String message, String details) {
}

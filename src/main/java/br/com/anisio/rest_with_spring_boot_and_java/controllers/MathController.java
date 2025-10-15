package br.com.anisio.rest_with_spring_boot_and_java.controllers;

import br.com.anisio.rest_with_spring_boot_and_java.exception.UnsuportedMathOperationException;
import br.com.anisio.rest_with_spring_boot_and_java.util.NumberUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numUm}/{numDois}")
    public Double sum(
                        @PathVariable("numUm") String numUm,
                        @PathVariable("numDois") String numDois ) throws Exception {
        if(!NumberUtils.isNumeric(numUm) || !NumberUtils.isNumeric(numDois)  )
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        return NumberUtils.convertToDouble(numUm) + NumberUtils.convertToDouble(numDois);
    }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numUm}/{numDois}")
    public Double subtraction(
            @PathVariable("numUm") String numUm,
            @PathVariable("numDois") String numDois ) throws Exception {
        if(!NumberUtils.isNumeric(numUm) || !NumberUtils.isNumeric(numDois)  )
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        return NumberUtils.convertToDouble(numUm) - NumberUtils.convertToDouble(numDois);
    }
    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numUm}/{numDois}")
    public Double division(
            @PathVariable("numUm") String numUm,
            @PathVariable("numDois") String numDois ) throws Exception {
        if(!NumberUtils.isNumeric(numUm) || !NumberUtils.isNumeric(numDois)  )
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        Double resultado = NumberUtils.convertToDouble(numUm) / NumberUtils.convertToDouble(numDois);
        BigDecimal bd = new BigDecimal(resultado).setScale(4, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numUm}/{numDois}")
    public Double multiplication(
            @PathVariable("numUm") String numUm,
            @PathVariable("numDois") String numDois ) throws Exception {
        if(!NumberUtils.isNumeric(numUm) || !NumberUtils.isNumeric(numDois)  )
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        Double resultado = NumberUtils.convertToDouble(numUm) * NumberUtils.convertToDouble(numDois);
        BigDecimal bd = new BigDecimal(resultado).setScale(4, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // http://localhost:8080/math/average/3/5
    @RequestMapping("/average/{numUm}/{numDois}")
    public Double average(
            @PathVariable("numUm") String numUm,
            @PathVariable("numDois") String numDois ) throws Exception {
        if(!NumberUtils.isNumeric(numUm) || !NumberUtils.isNumeric(numDois)  )
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        Double resultado = ((NumberUtils.convertToDouble(numUm) + NumberUtils.convertToDouble(numDois))/2);
        BigDecimal bd = new BigDecimal(resultado).setScale(4, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // http://localhost:8080/math/sqr/3
    @RequestMapping("/sqr/{numUm}")
    public Double sqr(
            @PathVariable("numUm") String numUm) throws Exception {
        if(!NumberUtils.isNumeric(numUm))
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        BigDecimal bd = new BigDecimal(Math.sqrt(NumberUtils.convertToDouble(numUm))).setScale(4, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}

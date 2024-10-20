package br.com.fiap.ecommerce.views;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface PedidoFullView {
    Long getId();
    Long getIdCliente();
    String getStatus();
    String getFormaPagamento();
    BigDecimal getValorTotal();
    LocalDate getDataPedido();

}

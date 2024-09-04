package Aula_Enum;

public class Principal_enumPedido {

	public static void main(String[] args) {
		
		StatusPedido status = StatusPedido.ABERTO.CANCELADO.EM_ANDAMENTO.ENTREGUE;
		
		System.out.println(status);			

	}

}

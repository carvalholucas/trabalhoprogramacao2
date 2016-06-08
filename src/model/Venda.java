package model;

import java.util.ArrayList;

public class Venda {

	private int codigo;
	private Cliente cliente;
	private ArrayList<Produto> listaDeProdutos;
	private double total;
	
	public Venda(int codigo, Cliente cliente, ArrayList<Produto> listaDeProdutos) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.listaDeProdutos = listaDeProdutos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
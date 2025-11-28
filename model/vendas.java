
public class Vendas {
    private int id;
    private int idCliente;
    private double data_venda;
    private double valor_total;

    public Vendas() {
    }

    public Vendas(int id, int idCliente, double data_venda, double valor_total) {
        this.id = id;
        this.idCliente = idCliente;
        this.data_venda = data_venda;
        this.valor_total = valor_total;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public double getData_venda() {
        return data_venda;
    }
    public void setData_venda(double data_venda) {
        this.data_venda = data_venda;
    }
    public double getValor_total() {
        return valor_total;
    }
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

}

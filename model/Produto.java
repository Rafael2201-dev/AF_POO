  public class Produto {
        private int id; 
        private String nome;
        private double preco;
        private String marca;
        private String categoria;
        private String descricao;

        public Produto() {
        }

        public Produto(int id, String nome, double preco, String marca, String categoria, String descricao) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
            this.marca = marca;
            this.categoria = categoria;
            this.descricao = descricao;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }
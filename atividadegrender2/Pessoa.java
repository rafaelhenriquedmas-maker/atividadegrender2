public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public double CalculaIMC() {
        if (this.altura <= 0) {
            this.imc = 0.0;
            return this.imc;
        }
        this.imc = this.peso / (this.altura * this.altura);
        return this.imc;
    }

    public String InformaObesidade() {
        if (this.imc <= 0) {
            return "IMC nao calculado ou altura invalida";
        } else if (this.imc < 18.5) {
            return "Abaixo do peso";
        } else if (this.imc < 25.0) {
            return "Peso normal";
        } else if (this.imc < 30.0) {
            return "Sobrepeso";
        } else if (this.imc < 35.0) {
            return "Obesidade grau I";
        } else if (this.imc < 40.0) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
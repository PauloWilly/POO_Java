public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    // Métodos Especiais
    public ContaBanco() {
      this.setSaldo(0);
      this.setStatus(false);
    }
    public void setNumConta(int numConta) {
      this.numConta = numConta;
    }
    public int getNumConta() {
      return numConta;
    }
    public void setTipo(String tipo) {
      this.tipo = tipo;
    }
    public String getTipo() {
      return tipo;
    }
    public void setDono(String dono) {
      this.dono = dono;
    }
    public String getDono() {
      return dono;
    }
    public void setSaldo(float saldo) {
      this.saldo = saldo;
    }
    public float getSaldo() {
      return saldo;
    }
    public void setStatus(boolean status) {
      this.status = status;
    }
    public boolean getStatus() {
      return status;
    }
    
    // Métodos Personalizados
    public void abrirConta(String t) {
      this.setTipo(t);
      this.setStatus(true);
      if (t == "CC") {
        //this.saldo = 50;
        this.setSaldo(50); // mesmo que o de cima, porém não mexe direto no atributo e sim no método, sendo o mais recomendado
      } else if (t == "CP") {
        //this.saldo = 150;
        this.setSaldo(150); // mesmo que o de cima, porém não mexe direto no atributo e sim no método, sendo o mais recomendado
      }
      System.out.println("Conta aberta com sucesso!");
    }  
    public void fecharConta() {
      if (this.getSaldo() > 0) {
        System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro"); // Evitar mostrar "prints" dentro de classe; encapsular é melhor maneira; aqui foi mais por questões didáticas
      } else if (this.getSaldo() < 0) {
        System.out.println("Conta não pode ser fechada pois tem débito");
      } else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso!");
      }
    }
    public void depositar(float v) {
      if (this.getStatus()) {
        //this.saldo += v;
        this.setSaldo(getSaldo() + v); //maneira melhor
        System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
      } else {
        System.out.println("Impossível depositar em um conta fechada!");
      }
    }  
    public void sacar(float v) {
      if (this.getStatus()) {
        if (this.getSaldo() >= v) {
          this.setSaldo(this.getSaldo() - v);
          System.out.println("Saque realizado na conta de " + this.getDono());
        } else {
          System.out.println("Saldo insuficiente para saque");
        }
      } else {
        System.out.println("Impossível sacar de uma conta fechada!");
      }
    }
    public void pagarMensal() {
      int v = 0;
      if (this.getTipo() == "CC") {
        v = 12;
      } else if (this.getTipo() == "CP") {
        v = 20;
      }
      if (this.getStatus()) {
          this.setSaldo(this.getSaldo() - v);
          System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
          System.out.println("Saldo insuficiente");
        }
      }
    public void estadoAtual() {
        System.out.println("--------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}

  
package Backend;

import Backend.Pagamento;

public class Paypal extends Pagamento {
    private String email;

    public Paypal() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

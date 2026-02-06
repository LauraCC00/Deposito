package cuentas;

/**Clase que representa una cuenta bancaria.
 * Permite realizar ingresos, retiradas y consultar el saldo.
  */

public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Numero de la cuenta */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros.
     *@param nom nombre del titular
     *@param cue numero de cuenta
     *@param sal saldo inicial
     *@param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * 
     * @return nombre del titular
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del titular
	 * @param nombre nuevo nombre del titular
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
     * Devuelve el número de cuenta.
     * @return número de cuenta
     */
	private String getCuenta() {
		return cuenta;
	}

	 /**
     * Modifica el número de cuenta.
     * @param cuenta nuevo número de cuenta
     */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	 /**
     * Devuelve el saldo actual.
     * @return saldo de la cuenta
     */
	private double getSaldo() {
		return saldo;
	}

	 /**
     * Modifica el saldo de la cuenta.
     * @param saldo nuevo saldo
     */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	 /**
     * Devuelve el tipo de interés.
     * @return tipo de interés
     */
	private double getTipoInterés() {
		return tipoInterés;
	}

	 /**
     * Modifica el tipo de interés.
     * @param tipoInterés nuevo tipo de interés
     */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}

package academy.conto.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conto")
public class Conto extends ContoAbstractEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "iban")
	private String iban;
	
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	public Conto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param iban
	 * @param idCliente
	 */
	public Conto(Integer id, String iban, Integer idCliente) {
		super();
		this.id = id;
		this.iban = iban;
		this.idCliente = idCliente;
	}

	/**
	 * @param iban
	 * @param idCliente
	 */
	public Conto(String iban, Integer idCliente) {
		super();
		this.iban = iban;
		this.idCliente = idCliente;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * @return the idCliente
	 */
	public Integer getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Conto [id=" + id + ", iban=" + iban + ", idCliente=" + idCliente + "]";
	}

	
	
	
	
}

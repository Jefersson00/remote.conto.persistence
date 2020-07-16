package academy.conto.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movimento")
public class Movimento extends ContoAbstractEntity {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "dataMovimento")
	private Date dataMovimento;
	
	@Column(name = "ammontare")
	private Integer ammontare;
	
	@Column(name = "id_conto")
	private Integer idConto;
	
	public Movimento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param dataMovimento
	 * @param ammontare
	 * @param idConto
	 */
	public Movimento(Integer id, Date dataMovimento, Integer ammontare, Integer idConto) {
		super();
		this.id = id;
		this.dataMovimento = dataMovimento;
		this.ammontare = ammontare;
		this.idConto = idConto;
	}

	/**
	 * @param dataMovimento
	 * @param ammontare
	 * @param idConto
	 */
	public Movimento(Date dataMovimento, Integer ammontare, Integer idConto) {
		super();
		this.dataMovimento = dataMovimento;
		this.ammontare = ammontare;
		this.idConto = idConto;
	}

	/**
	 * @param ammontare
	 * @param idConto
	 */
	public Movimento(Integer ammontare, Integer idConto) {
		super();
		this.ammontare = ammontare;
		this.idConto = idConto;
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
	 * @return the dataMovimento
	 */
	public Date getDataMovimento() {
		return dataMovimento;
	}

	/**
	 * @param dataMovimento the dataMovimento to set
	 */
	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	/**
	 * @return the ammontare
	 */
	public Integer getAmmontare() {
		return ammontare;
	}

	/**
	 * @param ammontare the ammontare to set
	 */
	public void setAmmontare(Integer ammontare) {
		this.ammontare = ammontare;
	}

	/**
	 * @return the idConto
	 */
	public Integer getIdConto() {
		return idConto;
	}

	/**
	 * @param idConto the idConto to set
	 */
	public void setIdConto(Integer idConto) {
		this.idConto = idConto;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Movimento [id=" + id + ", dataMovimento=" + dataMovimento + ", ammontare=" + ammontare + ", idConto="
				+ idConto + "]";
	}

	
}

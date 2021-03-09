package model.daos;

import java.util.List;

import model.beans.Familia;

public interface IntFamiliaDao {
	int altaFamilia(Familia familia);
	int deleteFamilia(Familia familia);
	int deleteFamilia(int idFamilia);
	int updateFamilia(Familia familia);
	Familia findById(int idFamilia);
	List<Familia> findAll();

}

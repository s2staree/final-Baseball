package site.metacoding.red.domain.stadium;

import java.util.List;

public interface StadiumDAO {
	public void insert(Stadium stadium);
	public List<Stadium> findAll();
	public void deleteById(int id);
	public Stadium findByIdAndName(int id, String name);
	public void update(Stadium stadium);
}

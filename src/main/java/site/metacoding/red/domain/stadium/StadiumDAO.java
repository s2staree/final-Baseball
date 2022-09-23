package site.metacoding.red.domain.stadium;

public interface StadiumDAO {
	public void insert(Stadium stadium);
	public Stadium findById(Integer id);
}

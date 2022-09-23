package site.metacoding.red.domain.expulsion;

public interface ExpulsionDAO {
	public void insert(Expulsion expulsion);
	public Expulsion findById(Integer id);
}

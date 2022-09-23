package site.metacoding.red.domain.team;

public interface TeamDAO {
	public void insert(Team team);
	public Team findById(Integer id);
}

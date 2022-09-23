package site.metacoding.red.domain.player;

public interface PlayerDAO {
	public void insert(Player player);
	public Player findById(Integer id);
}

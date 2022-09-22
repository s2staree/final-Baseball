package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private Integer teamId;
	private String position;
	private String playerName;
	private Timestamp createDate;
}

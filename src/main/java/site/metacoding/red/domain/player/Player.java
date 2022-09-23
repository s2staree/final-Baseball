package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Player {
	private Integer id;
	private Integer teamId;
	private Integer positionsId;
	private String playerName;
	private Timestamp regDate;
}

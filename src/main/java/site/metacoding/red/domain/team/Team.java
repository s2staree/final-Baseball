package site.metacoding.red.domain.team;

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
public class Team {
	private Integer id;
	private Integer stadiumId;
	private String teamName;
	private Timestamp createDate;
}

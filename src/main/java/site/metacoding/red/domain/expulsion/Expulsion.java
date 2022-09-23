package site.metacoding.red.domain.expulsion;

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
public class Expulsion {
	int id;
	int teamId;
	int positionsId;
	int playerId;
	String reason;
	Timestamp expDate;
}

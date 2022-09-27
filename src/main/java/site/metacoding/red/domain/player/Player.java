package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private boolean isOuter;
	private Timestamp createdAt;
	
	// 엔티티가 아닌 필드 (transient). 메모리에서만 노는 애들 
	private Integer no;
	private String teamName;
}	

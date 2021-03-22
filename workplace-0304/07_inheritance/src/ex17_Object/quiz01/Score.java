package ex17_Object.quiz01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Score {

	// field
	private int kor, eng, mat;

	@Override
	public String toString() {
		return String.format("[국어: %d, 영어: %d, 수학: %d]", kor, eng, mat);
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		if (obj instanceof Score) {
			Score s = (Score) obj;
			if (this.getEng() == s.getEng() && this.getKor() == s.getKor() && this.getMat() == s.getMat())
				return true;
		}
		return false;
	}

}

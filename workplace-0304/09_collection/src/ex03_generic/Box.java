package ex03_generic;

public class Box<T> {

	// field
	private T[] items;
	private int idx;

	// constructor
	@SuppressWarnings("unchecked")
	public Box(int count) {
		// items = new T[count]; 코드 작성 시점에는 T의 구체적인 종류를 알 수 없어서, 메모리 할당이 불가능합니다
		items = (T[])(new Object[count]); // Object 배열 생성 뒤에는 캐스팅을 해 줘야 합니다
	}

	public void addItem(T item) throws Exception {
		if (idx < items.length) {
			items[idx] = item;
			idx++;
		} else {
			throw new Exception("Too Many Items");
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (T item : items) {
			if (item == null)
				break;
			str += item + "\n";
		}
		return str;
	}

}

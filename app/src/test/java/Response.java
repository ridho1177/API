import java.util.List;

public class Response{
	private Dates dates;
	private int page;
	private int totalPages;
	private List<ResultsItem> results;
	private int totalResults;

	public Dates getDates(){
		return dates;
	}

	public int getPage(){
		return page;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public int getTotalResults(){
		return totalResults;
	}
}

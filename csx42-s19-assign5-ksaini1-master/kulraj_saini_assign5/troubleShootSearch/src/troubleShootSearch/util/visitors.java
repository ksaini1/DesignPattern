package troubleShootSearch.util;

public interface visitors {

	String visit(Exact exact);
	String visit(Semantic semantic);
	String visit(Stemming stem);
}

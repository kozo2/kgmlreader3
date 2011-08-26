package org.cytoscape.io.kegg;

import java.io.InputStream;

import org.cytoscape.io.CyFileFilter;
import org.cytoscape.io.read.InputStreamTaskFactory;
import org.cytoscape.model.CyNetworkFactory;
import org.cytoscape.view.model.CyNetworkViewFactory;
import org.cytoscape.work.TaskIterator;

public class KGMLReaderFactory implements InputStreamTaskFactory {

	private final CyFileFilter filter;
	
	protected final CyNetworkViewFactory cyNetworkViewFactory;
	protected final CyNetworkFactory cyNetworFactory;
	
	protected InputStream inputStream;
	protected String inputName;
	
	public KGMLReaderFactory(CyFileFilter filter, CyNetworkViewFactory cyNetworkViewFactory,
			CyNetworkFactory cyNetworkFactory) {
		this.filter = filter;
		this.cyNetworkViewFactory = cyNetworkViewFactory;
		this.cyNetworFactory = cyNetworkFactory;		
	}
	
	@Override
	public TaskIterator getTaskIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyFileFilter getCyFileFilter() {
		return filter;
	}

	@Override
	public void setInputStream(InputStream is, String in) {
		if (is == null)
			throw new NullPointerException("Input stream is null");
		inputStream = is;
		inputName = in;
	}

}

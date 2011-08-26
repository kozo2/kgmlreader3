package org.cytoscape.io.kegg;

import java.io.InputStream;

import org.cytoscape.io.read.CyNetworkReader;
import org.cytoscape.model.CyNetwork;
import org.cytoscape.model.CyNetworkFactory;
import org.cytoscape.view.model.CyNetworkView;
import org.cytoscape.view.model.CyNetworkViewFactory;
import org.cytoscape.view.vizmap.VisualStyle;
import org.cytoscape.work.AbstractTask;
import org.cytoscape.work.TaskMonitor;
import org.cytoscape.data.reader.kgml.generated.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class KGMLReader extends AbstractTask implements CyNetworkReader {
	private static final Logger logger = LoggerFactory.getLogger(KGMLReader.class);
	
	static final String NETWORK_TYPE = "network type";
	static final String NETWORK_TYPE_VALUE = "KEGG Pathway";
	static final String SPECIES = "KEGG.org";
	static final String NUMBER = "KEGG.number";
	static final String IMAGE = "KEGG.image";
	static final String LINK = "KEGG.link";
	static final String TITLE = "KEGG.title";
	
	private int[] nodeIdx;
	private int[] edgeIdx;
	
	private String networkName;
	private Pathway pathway;
	
	protected CyNetwork[] cyNetworks;
	
	protected VisualStyle[] visualstyles;
	protected InputStream inputStream;

	protected final CyNetworkViewFactory cyNetworkViewFactory;
	protected final CyNetworkFactory cyNetworkFactory;	
	
	public KGMLReader(InputStream inputStream, final CyNetworkViewFactory cyNetworkViewFactory,
			final CyNetworkFactory cyNetworkFactory) {
		if (inputStream == null)
			throw new NullPointerException("Input stream is null");
		if (cyNetworkViewFactory == null)
			throw new NullPointerException("CyNetworkViewFactory is null");
		if (cyNetworkFactory == null)
			throw new NullPointerException("CyNetworkFactory is null");
		
		this.inputStream = inputStream;
		this.cyNetworkViewFactory = cyNetworkViewFactory;
		this.cyNetworkFactory = cyNetworkFactory;
	}
	
	@Override
	public CyNetwork[] getCyNetworks() {
		return cyNetworks;
	}

	@Override
	public CyNetworkView buildCyNetworkView(CyNetwork network) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run(TaskMonitor taskMonitor) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

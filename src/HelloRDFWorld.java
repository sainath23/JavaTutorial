//import java.io.ByteArrayOutputStream;
//import java.util.Iterator;
//import org.apache.jena.util.FileManager;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
//import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.RDFNode;
//import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.RDFDataMgr;
//import org.apache.jena.rdf.model.Literal;

public class HelloRDFWorld {
	
	static void sparqlTest() {
		//FileManager.get().addLocatorClassLoader(HelloRDFWorld.class.getClassLoader());
		
		//Model model = FileManager.get().loadModel("D:/Eclipse/workspace/JavaTutorial/src/CottonOntology.owl");
		Model model = RDFDataMgr.loadModel("http://myontology.16mb.com/ontology/CottonOntology.owl");
		String queryString = 
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "+
				"PREFIX owl: <http://www.w3.org/2002/07/owl#> "+
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "+
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> "+
				"PREFIX co: <http://www.semanticweb.org/sainath/ontologies/2016/11/CottonOntology#> "+
				"select ?Insect ?Prevention where{?Insect co:hasDataSymptom ?Symptoms."+
				"?Insect co:isPreventedBy ?Prevention."+
				"?Insect co:hasName co:Cotton_bollworm.}";
		
		Query query = QueryFactory.create(queryString);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
			ResultSet results = qexec.execSelect();
			//ResultSetFormatter.out(System.out, results, query);
			//String r = ResultSetFormatter.asText(results, query);
			//return r;
			if(results.hasNext() == true) 
			while(results.hasNext()) {
				QuerySolution soln = results.nextSolution();
				//Resource disease = (Resource) soln.get("Diseases");
				RDFNode disease = soln.get("Insect");
				String d = disease.asNode().getLocalName();
				System.out.println(d);
				//String s = soln.get("Insect").toString();
				//System.out.println(s);
				String p = soln.get("Prevention").toString();
				System.out.println(p);

			}
			else
				System.out.println("Not found!");
			//ResultSet results = qexec.execSelect();
			//ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			//ResultSetFormatter.outputAsJSON(outputStream, results);
			//String json = new String(outputStream.toByteArray());
			//System.out.println(json);
			
		} finally {
			qexec.close();
		}
		//model.write(System.out, "RDF/JSON");   //RDF/JSON, TURTLE, RDF/XML
	}
	
	public static void main(String[] args) {
		sparqlTest();
	}
	
}

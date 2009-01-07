package com.google.code.any23.vocab;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.DC;
 
/**
 * Vocabulary definitions from vocabularies/review.rdf 
 * @author Auto-generated by schemagen on 14 mag 2008 19:01 
 */
public class REVIEW {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.purl.org/stuff/rev#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The commenter on the review</p> */
    public static final Property commenter = m_model.createProperty( "http://www.purl.org/stuff/rev#commenter" );
    
    /** <p>Used to associate a review with a comment on the review</p> */
    public static final Property hasComment = m_model.createProperty( "http://www.purl.org/stuff/rev#hasComment" );
    
    /** <p>Associates a review with a feedback on the review</p> */
    public static final Property hasFeedback = m_model.createProperty( "http://www.purl.org/stuff/rev#hasFeedback" );
    
    /** <p>Associates a work with a a review</p> */
    public static final Property hasReview = m_model.createProperty( "http://www.purl.org/stuff/rev#hasReview" );
    
    /** <p>A numeric value</p> */
    public static final Property maxRating = m_model.createProperty( "http://www.purl.org/stuff/rev#maxRating" );
    
    /** <p>A numeric value</p> */
    public static final Property minRating = m_model.createProperty( "http://www.purl.org/stuff/rev#minRating" );
    
    /** <p>Number of positive usefulness votes (integer)</p> */
    public static final Property positiveVotes = m_model.createProperty( "http://www.purl.org/stuff/rev#positiveVotes" );
    
    /** <p>A numeric value</p> */
    public static final Property rating = m_model.createProperty( "http://www.purl.org/stuff/rev#rating" );
    
    /** <p>The person that has written the review</p> */
    public static final Property reviewer = m_model.createProperty( "http://www.purl.org/stuff/rev#reviewer" );
    
    /** <p>The text of the review</p> */
    public static final Property text = m_model.createProperty( "http://www.purl.org/stuff/rev#text" );
    
    /** <p>The title of the review</p> */
    public static final Property title = m_model.createProperty( "http://www.purl.org/stuff/rev#title" );
    
    /** <p>Number of usefulness votes (integer)</p> */
    public static final Property totalVotes = m_model.createProperty( "http://www.purl.org/stuff/rev#totalVotes" );
    
    /** <p>The type of media of a work under review</p> */
    public static final Property type = m_model.createProperty( "http://www.purl.org/stuff/rev#type" );
    
    /** these are here for simplicity and Java namespacing */
    public static final Property date = DC.date;
    public static final Property fn  = DC.title;
    public static final Property url = DC.identifier;
    public static final Property photo = m_model.createProperty("http://purl.org/dc/dcmitype/Image");

    /** <p>A comment on a review</p> */
    public static final Resource Comment = m_model.createResource( "http://www.purl.org/stuff/rev#Comment" );
    
    /** <p>Feedback on the review. Expresses whether the review was useful or not</p> */
    public static final Resource Feedback = m_model.createResource( "http://www.purl.org/stuff/rev#Feedback" );
    
    /** <p>A review of an work</p> */
    public static final Resource Review = m_model.createResource( "http://www.purl.org/stuff/rev#Review" );
    
}


package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object help extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main("ProConect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
	"""),_display_(Seq[Any](/*2.3*/navbar/*2.9*/.render)),format.raw/*2.16*/("""
		
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h3>
					Help Center<br />
				</h3>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<img alt="140x140" src="http://www.medisolsoft.com/images/support.jpg" />
				<form class="navbar-form navbar-right" role="search">
			      <div class="form-group">
			        <input type="text" class="form-control" placeholder="How Can We Help You?">
			      </div>
			      <button type="submit" class="btn btn-success">Submit</button>
			    </form>
			    <br /><br /><br />

			</div>
		</div>


		<h3>
					Frequently Asked Questions<br />
				</h3>

		<div class="row clearfix">
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							ProConnect Account
						</h3>
					</div>
					
	  <div class="panel-body">
	  <a href="#" class="btn" data-toggle="collapse" data-target="#demo">How do I update my ProConnect profile?</button>
	  <div id="demo" class="collapse in">
	    answer
	  </div>
	  </div>

					<div class="panel-body">
						<a href="#" class="btn" data-toggle="collapse" data-target="#demo">How can I turn off Twitter feed?</button>
	  <div id="demo" class="collapse in">
	    answer
	  </div>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How do I change my profile picture?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I delete my proConnect account?</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							Connections
						</h3>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How do I add friends on ProConnect?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">Where can I view who my connections are?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I remove someone from my connections?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I block someone on ProConnect?</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							Forums
						</h3>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">What are forums for on ProConnect?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I create a new forum?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I contribute to a forum?</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							Job Search
						</h3>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I search for jobs on ProConnect?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I apply to a job through ProConnect?<br /><br /><br /><br /></a>
					</div>
					
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							Privacy Settings
						</h3>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I change my password?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">Who can view my profile?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I change my email address?</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							Premium Accounts
						</h3>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">What are the benefits of a premium account?</a>
					</div>
					<div class="panel-body">
					<a href="#" class="btn" type="button">How can I cancel my premium membership?<br /><br /><br /><br /></a>
					</div>
					
				</div>
			</div>
		</div>

		<div class="row clearfix">
			<div class="col-md-6 column">
				<img alt="140x140" src="http://www.medisolsoft.com/images/support.jpg" /><br /><br />
			</div>
			<div class="col-md-6 column">
			<h3>
				 Can't find what you are looking for?<br />Contact us at supportproConnectors.com and we will get back to you within 24 hours.
				 </h3>
			</div>
		</div>
	</div>
		
	""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 30 14:12:53 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/help.scala.html
                    HASH: fda29bb1971460d6c031f8caf458712edc040783
                    MATRIX: 863->2|888->19|926->20|964->24|977->30|1005->37
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2
                    -- GENERATED --
                */
            
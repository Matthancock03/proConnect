
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

			    <br /><br />

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
					  <a   data-toggle="collapse" data-target="#demo0">How do I update my ProConnect profile?</a>
					  <div id="demo0" class="collapse">
					    You can update the information on your profile by clicking "Edit Profile" button on the Profile page.
					  </div>
				  </div>

					<div class="panel-body">
						<a data-toggle="collapse" data-target="#demo1">How can I turn off Twitter feed?</a>
					    <div id="demo1" class="collapse">
					    Unfortunately, it is not possible to turn off Twitter feed at this point.
					  	</div>

					</div>
					<div class="panel-body">
						<a data-toggle="collapse" data-target="#demo2">How do I change my profile picture?</a>
						<div id="demo2" class="collapse">
					    By clicking "Edit Profile" on the Profile page you will have the option of browsing for a photo on your computer and changing your picture.
					  	</div>
					</div>

					<div class="panel-body">
							<a data-toggle="collapse" data-target="#demo3">How can I delete my proConnect account?</a>
							<div id="demo3" class="collapse">
						    Unfortunately you cannot delete a ProConnect account at this point.
					  		</div>
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
					<a data-toggle="collapse" data-target="#demo4">How do I add connections on ProConnect?</a>
							<div id="demo4" class="collapse">
						    You can search for connections by typing a name in the "Search" bar and choosing "People" as a filter.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo5">Where can I view who my connections are?</a>
							<div id="demo5" class="collapse">
						    You can view your connection list at the bottom of your profile page.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo6">How can I remove someone from my connections?</a>
							<div id="demo6" class="collapse">
						    You can remove a connection by clicking "Remove from Connection" on their profile.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo7">How can I block someone on ProConnect?</a>
							<div id="demo7" class="collapse">
						    Unfortunately there is no feature to block someone on ProConnect at this point. If you want to report someone please feel free to contact us at supportProConnectors.com.
					  		</div>
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
					<a data-toggle="collapse" data-target="#demo8">What are forums for on ProConnect?</a>
							<div id="demo8" class="collapse">
						    Forums are a way for our users to discuss and share their experiences with everybody else and hopefully learn a thing or two from them.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo9">How can I create a new forum?</a>
							<div id="demo9" class="collapse">
						    If you are a premium user you can create a new forum by clicking "New Forum" on the Forum page.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo10">How can I contribute to a forum?</a>
							<div id="demo10" class="collapse">
						    You can contribute to a forum by clicking on "Read" on any one of the forums you would like and submitting a comment in the comment section
					  		</div>
					</div>
				</div>
			</div>
			<div class="col-md-6 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							Privacy Settings
						</h3>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo13">How can I change my password?</a>
							<div id="demo13" class="collapse">
						    Please contact us at supportProConnectors.com if you want to change your password.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo14">Who can view my profile?</a>
							<div id="demo14" class="collapse">
						    Any ProConnect user is able to search your name and view your profile.
					  		</div>

					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo15">How can I change my email address?</a>
							<div id="demo15" class="collapse">
						    Once you sign up for an account you cannot change your email. You can always sign up for another account and use a different email address. For more help please contact us at supportProConnectors.com.
					  		</div>
					</div>
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
					<a data-toggle="collapse" data-target="#demo11">How can I search for jobs on ProConnect?</a>
							<div id="demo11" class="collapse">
						    To search for a job, simply type a job title or company name in the search bar. You can also filter the search result by clicking on either the "Job" or "Company" filter.
					  		</div>

					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo12">How can I apply to a job through ProConnect?</a>
							<div id="demo12" class="collapse">
						    You cannot apply to a job on ProConnect directly. However, recruiters will provide a URL of where you can apply to the job on the job post.
					  		</div>
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
					<a data-toggle="collapse" data-target="#demo16">What are the benefits of a premium account?</a>
							<div id="demo16" class="collapse">
						    By signing up for a premium account, you will have access to find the right candidate for a job by searching based on experience, major, etc. You are also able to post jobs. Another feature that is only accessible to our premium users is being able to create forums.
					  		</div>
					</div>
					<div class="panel-body">
					<a data-toggle="collapse" data-target="#demo17">How can I cancel my premium membership?</a>
							<div id="demo17" class="collapse">
						  If you accidentally signed up for a premium account and would like to change that a regular account please contact us at supportProConnectors.com.
					  		</div>
					</div>

				</div>
			</div>


		<div class="row clearfix">
			<div class="col-md-12 column">
				<!-- <br /><img alt="140x140" src="http://www.medisolsoft.com/images/support.jpg" /><br /><br /> -->

			<div class="col-md-6 column">
				 <h3>
				 <br /><br />Can't find what you are looking for?<br />Contact us at supportproConnectors.com and we will get back to you within 24 hours.<br /><br />
				 </h3>
			</div>
		</div>
	</div>

	""")))})),format.raw/*216.3*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 13:01:24 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/help.scala.html
                    HASH: 6d68533dcc9d787935860aca0a666026e83ed5cf
                    MATRIX: 863->2|888->19|926->20|964->24|977->30|1005->37|9268->8268
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|244->216
                    -- GENERATED --
                */
            
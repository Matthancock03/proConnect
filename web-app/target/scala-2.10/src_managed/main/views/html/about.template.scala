
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
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*2.31*/routes/*2.37*/.Assets.at("stylesheets/splash.css"))),format.raw/*2.73*/("""">
<div class="container-fluid">


	<div class="row clearfix topSplash">
    <nav class="navbar navbar-inverse">
  				<div class="navbar-header">
  					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
  						<span class="sr-only">Toggle navigation</span>
  						<span class="icon-bar"></span>
  						<span class="icon-bar"></span>
  						<span class="icon-bar"></span>
  					</button>
  					<a class="navbar-brand" href=""""),_display_(Seq[Any](/*15.39*/securesocial/*15.51*/.controllers.routes.LoginPage.login().absoluteURL())),format.raw/*15.102*/("""">ProConnect</a>
  				</div>
  				<div id="navbar" class="collapse navbar-collapse">
  			</div>
  		</nav>

      <div class="col-xs-3 column">
  		</div>
      <div class="col-xs-6 column">
				<h1 class ="header-text text-left"> ProConnect </h1>
				<h1 class ="text-center">Connect with Proffesionals</h1>
  		</div>
  		<div class="col-xs-3 column">
  		</div>
    </div>

	</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-4 column">
						<h2>
							Getting Started
						</h2>
						<p>
							Our purpose is to connect with other proffesionals and share skill sets and accomplisments. Hiring managers and recruiters have the ability to search a compiled database of candidates that meet their criteria.
						</p>
						<p>
							<a class="btn" href="#">Get Started Here »</a>
						</p><img alt="140x140" src = "  http://proconnect.herokuapp.com/assets/images/proConnect.jpg " class="img-rounded" />
					</div>
					<div class="col-md-4 column">
					</div>
					<div class="col-md-4 column">
						<h2>
							Take proConnect with you
						</h2>
						<p>
ProConnect provides an Android application were users can disscuss and share experiences on the go.
						</p>
						<p>
							<a class="btn" href="#">View details »</a>
						</p><img alt="140x140" src=" http://www.smallbusinesscomputing.com/imagesvr_ce/9337/Technology_350.jpg" class="img-rounded" />
					</div>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-4 column">
			</div>
			<div class="col-md-4 column">
			</div>
			<div class="col-md-4 column">
			</div>








      <div class="row clearfix">
        <div class="col-xs-3 column">
    		</div>
        <div class="col-xs-6 column">
          <h1 class ="text-center"></h1>


                    <h3 style="color:green",class ="text-left">  <b> About us </b>
                    <p>
                    Welcome to Proconnect, a professional networking service - a networking service that helps professional to connect with worlds of professions
                     </p>
</h3>
<p></p>
                    <h3 style="color:black",class ="text-left",style="font-size:200%"> <b>Mission</b>
                    <p>
                     Our Mission is to help people to create a profile and connect with other professionals, to join discussions, share experiences, and make announcements.
                    </p>
</h3>
<p></p>

                   <h3 style="color:green",class ="text-left">  <b>Information</b>
                    <p>
                   Procennect is publicly held and has a diversified business model
                    </p>
                    <p></p>
                    <p></p>
                    <p style="color:black">
                      For more information about our company, please visit our Company Page.
                      </p>
                    <p>

                    </p>
                    <p></p>
             <p>
              For more information, please contact us at proconect.com.
             </p>

   </h3>

        </div>
        <div class="col-xs-3 column">
        </div>
      </div>
""")))})),format.raw/*120.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 01 20:26:11 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/about.scala.html
                    HASH: cd453643d0689b0f8ee1f4616ecf3768e73c477c
                    MATRIX: 864->1|890->19|928->20|994->51|1008->57|1065->93|1627->619|1648->631|1722->682|4941->3869
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|43->15|43->15|43->15|148->120
                    -- GENERATED --
                */
            
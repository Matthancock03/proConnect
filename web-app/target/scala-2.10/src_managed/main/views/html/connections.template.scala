
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
object connections extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
  """),_display_(Seq[Any](/*2.4*/navbar/*2.10*/.render)),format.raw/*2.17*/("""

  <h1>

""")))})),format.raw/*6.2*/("""




			<h2>
				Connections

        <form class="navbar-form navbar-right" role="Connect">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="search for people">
      </div>
      <button type="submit" class="btn btn-default">Search</button>
      </form>
			</h2>


			<p>


			</p>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://howdoifindhappiness.com/sites/default/files/field/image/39%20-Keeping%20in%20Contact%20with%20People%20you%20Don%E2%80%99t%20See%20Often.jpg" />
						<div class="caption">
							<h3>
								Keep in touch
							</h3>
							<p>

							</p>
							<p>
								<a class="btn btn-primary" href="#">Connect</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://www.crucial.com.au/blog/wp-content/uploads/2013/03/World-Connections.jpg" />
						<div class="caption">
							<h3>
								Add Connections
							</h3>
							<p>

							</p>
							<p>
								<a class="btn btn-primary" href="#">Connect</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://www.westosha.k12.wi.us/alumni/assets/alumni.png" />
						<div class="caption">
							<h3>
								Find Alumni
							</h3>
							<p>

							</p>
							<p>
								<a class="btn btn-primary" href="#">Connect</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">




					</ol>
				</div>
			</div>
		</div>
	</div>
</div>

</h1>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 18:22:02 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/connections.scala.html
                    HASH: da6f209174b4fe51eb05f1f442816d562f32d5a2
                    MATRIX: 870->1|896->19|934->20|972->24|986->30|1014->37|1055->48
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|34->6
                    -- GENERATED --
                */
            
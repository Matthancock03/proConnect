
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
import helper._
/**/
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	"""),format.raw/*4.2*/("""<link rel="stylesheet" href=""""),_display_(/*4.32*/routes/*4.38*/.Assets.at("stylesheets/home.min.css")),format.raw/*4.76*/("""">


<div class="container-fluid">
	<div class="row clearfix">
		"""),_display_(/*9.4*/navbar/*9.10*/.render()),format.raw/*9.19*/("""
	"""),format.raw/*10.2*/("""</div>

	<div class="row clearfix">
		<div class="col-xs-12 column">
		</div>
	</div>

	<div class="row clearfix">
		<div class="col-xs-2 column">
			<img alt="140x140" class = "img-thumbnail profileImage" src="http://i.imgur.com/PcoAz60.jpg?1" />

			<dl class="dl-horizontal">
				<dt>
					Matthew Hancock
				</dt>
				<dd>
					Beyond Prosthetics
				</dd>
				<dd>
					San Jose State University
				</dd>
			</dl>
		</div>

		<div class="col-xs-6 column clearfix">

		</div>
		<div class="col-xs-4 column">
			<div>
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
				  </div>
				</div>
			</div>
		</div>


		</div>
	<div class="row clearfix">
		<div class="col-xs-6 column">
			<h2>
				Heading
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				<a class="btn" href="#">View details »</a>
			</p>
		</div>
		<div class="col-xs-6 column">
			<h2>
				Heading
			</h2>
			<p>
				Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
			</p>
			<p>
				<a class="btn" href="#">View details »</a>
			</p>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
			</dl>
		</div>
		<div class="col-xs-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
			</dl>
		</div>
		<div class="col-xs-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
			</dl>
		</div>
	</div>
	<div class="row clearfix">
	</div>
  </div>
</div>
""")))}),format.raw/*117.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 07 23:34:04 PDT 2015
                  SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/home.scala.html
                  HASH: 1fef47030bc76d30122c21a9699c4a7d97763e3d
                  MATRIX: 812->19|838->37|877->39|905->41|961->71|975->77|1033->115|1124->181|1138->187|1167->196|1196->198|3729->2700
                  LINES: 29->3|29->3|29->3|30->4|30->4|30->4|30->4|35->9|35->9|35->9|36->10|143->117
                  -- GENERATED --
              */
          
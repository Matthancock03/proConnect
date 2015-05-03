
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConect")/*1.19*/{_display_(Seq[Any](format.raw/*1.20*/("""
"""),_display_(Seq[Any](/*2.2*/navbar/*2.8*/.render)),format.raw/*2.15*/("""
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					Messages
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-2 column">

			<div class="btn-group btn-group-vertical btn-group-md">
			<br /><br /><br />
			 <button type="button" class="btn btn-success">Compose</button>
			 <br />
				 <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em> Inbox</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-center"></em> Sent</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-right"></em> Trash</button> <
			</div>
		</div>
		<div class="col-md-6 column">
		<form class="navbar-form navbar-right" role="search">

		      <div class="form-group">
		        <input type="text" class="form-control" placeholder="Search for Messages">
		      </div>
		      <button type="submit" class="btn btn-success">Submit</button>
		    </form>
			<table class="table table-condensed">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Message
						</th>
						<th>
							Date
						</th>
						<th>
							Status
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							1
						</td>
						<td>
						<a href="#" class="btn" type="button">Message 1</a>
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Read
						</td>
					</tr>
					<tr class="active">
						<td>
							2
						</td>
						<td>
							<a href="#" class="btn" type="button">Message 2</a>
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Unread
						</td>
					</tr>
					<tr class="success">
						<td>
							3
						</td>
						<td>
							<a href="#" class="btn" type="button">Message 3</a>
						</td>
						<td>
							02/04/2012
						</td>
						<td>
							Read
						</td>
					</tr>
					<tr class="warning">
						<td>
							4
						</td>
						<td>
							<a href="#" class="btn" type="button">Message 4</a>
						</td>
						<td>
							03/04/2012
						</td>
						<td>
							Read
						</td>
					</tr>
					<tr class="danger">
						<td>
							5
						</td>
						<td>
							<a href="#" class="btn" type="button">Message 5</a>
						</td>
						<td>
							04/04/2012
						</td>
						<td>
							Read
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-8 column">
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>
""")))})),format.raw/*153.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 02 14:37:04 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: 935fabd2d81053aed37c6d9b5a186b5aa4bea012
                    MATRIX: 866->1|891->18|929->19|965->21|978->27|1006->34|3960->2956
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|181->153
                    -- GENERATED --
                */
            
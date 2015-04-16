
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
object forum extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
  """),_display_(Seq[Any](/*2.4*/navbar/*2.10*/.render)),format.raw/*2.17*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3>
				Forums</br ><br /><br />
			</h3>


<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			 <button type="button" class="btn btn-success">New Forum</button>
		</div>
		<div class="col-md-6 column">
			 <form class="navbar-form navbar-right" role="search">

		      <div class="form-group">
		        <input type="text" class="form-control" placeholder="Search for Forums">
		      </div>
		      <button type="submit" class="btn btn-success">Submit</button>
		    </form>

		</div>
		</div>
	</div>
</div>

	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x600" src="http://blog.peertransfer.com/wp-content/uploads/2013/04/Biz-Finding-A-Job-May-Mean-Getting-More-Niche.jpg" />
						<div class="caption">
							<h3>
								How to Prepare for an Interview
							</h3>
							<p>
								Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.<br /><br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://www.jobinterviewperfection.com/images/interview-success.jpg" />
						<div class="caption">
							<h3>
								How to Get a Job With No Experience
							</h3>
							<p>
								Having no experience for a job of your choice will not necessarily eliminate you from being a good candidate. Your dedication, communication skills, and work ethic play a big role. However, in order to stand out you will need to follow a few rules and strategies. 
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://collegeinformations.com/wp-content/uploads/2012/05/choosing-a-major.jpg" />
						<div class="caption">
							<h3>
								5 Tips for Choosing the Right Major
							</h3>
							<p>
								They say choose your passion as your major and you will never have to work a day in your life. While this is true, there is more to knowing what major is right for you.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://blog.nextsociety.com/wp-content/uploads/2014/09/entrepreneurship-networking-advice-1.jpg" />
						<div class="caption">
							<h3>
								How to Grow your Network
							</h3>
							<p>
								Whether you want to grow your business or get an entry job position, networking is one of the many crucial factors which you should practice like any other skill to master it.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="https://media.licdn.com/mpr/mpr/p/8/005/081/32b/3e3556e.jpg" />
						<div class="caption">
							<h3>
								10 Steps to Starting a Business 
							</h3>
							<p>
								Starting a business involves a lot of research, financial investment, and going through a series of legal work. These 10 steps can help you get your business started and also prepare and manage your business.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://familywings.org/wp-content/uploads/2011/04/a-paper_11.jpg" />
						<div class="caption">
							<h3>
								Study Tips
							</h3>
							<p>
								Wondering why the all nighter before your final exam did not pay off and did not get you the grade you hoped for? Need to know how to study effectively? Then look no further. Any student can benefit from these tips and techniques.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://www.outsourcedcfo.co.za/wp-content/uploads/2014/02/financial-management.jpg" />
						<div class="caption">
							<h3>
								Beginner's Guide to Managing Your Finances
							</h3>
							<p>
								Whether you want to admit it or not, money is a huge part of your life nowadays, thus knowing how to manage it will help you take controlof your life and get you ahead financially and socially.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="http://higherperspective.com/wp-content/uploads/2014/12/Successful-Business-Risk.jpg" />
						<div class="caption">
							<h3>
								3 Ways to be More Successful
							</h3>
							<p>
								It's human nature to desire success no matter where they are in life. However, it's easier said than done, hence not a lot of people are willing to do what is necessary to reach success.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="https://venkyias.files.wordpress.com/2012/08/discussion1.jpg" />
						<div class="caption">
							<h3>
								General Discussion
							</h3>
							<p>
								If you cannot find the forum looking for, you can either create your own forum or try this one. You can find a wide variety of topics and questions in this forum. 
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a> 
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
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
""")))})),format.raw/*214.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 16 12:20:45 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/forum.scala.html
                    HASH: 1db293ed670ce76dc179f8a6975f7cddd13e96b4
                    MATRIX: 864->1|890->19|928->20|966->24|980->30|1008->37|7677->6674
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|242->214
                    -- GENERATED --
                */
            
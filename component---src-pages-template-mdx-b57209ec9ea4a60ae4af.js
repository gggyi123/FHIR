(window.webpackJsonp=window.webpackJsonp||[]).push([[24,18],{"013z":function(e,t,a){"use strict";a("HQhv"),a("sC2a");var r=a("qKvR"),n=a("pOBw"),o=a("q1tI"),i=a.n(o),s=a("huSw"),c=a("t0dz"),l=a.n(c),b=a("Bfmn"),d=a("a7k6"),u=a("TSYQ"),p=a.n(u),m=a("QH2O"),x=function(e){var t,a=e.children,n=e.title,o=e.tabs,i=void 0===o?[]:o,s=e.shouldHideHeader;return Object(r.b)("div",{className:p()((t={},t[m.pageHeader]=m.pageHeader,t[m.pageHeaderSticky]=i.length,t[m.pageHeaderShifted]=s,t))},Object(r.b)("div",{className:"bx--grid"},Object(r.b)("div",{className:"bx--row"},Object(r.b)("div",{className:"bx--col-lg-12"},Object(r.b)("h1",{id:"page-title",className:m.text},n)))),a)},g=a("Z3H1"),f=a("BAC9"),h=function(e){var t=e.relativePagePath,a=e.repository,n=g.data.site.siteMetadata.repository,o=a||n,i=o.baseUrl,s=i+"/tree/master"+o.subDirectory+"/src/pages"+t;return i?Object(r.b)("div",{className:"bx--row "+f.row},Object(r.b)("div",{className:"bx--col"},Object(r.b)("a",{className:f.link,href:s},"Edit this page on GitHub"))):null},O=a("FCXl"),v=a("Wbzz"),j=a("I8xM");var H=function(e){var t,a;function n(){return e.apply(this,arguments)||this}return a=e,(t=n).prototype=Object.create(a.prototype),t.prototype.constructor=t,t.__proto__=a,n.prototype.render=function(){var e=this.props,t=e.tabs,a=e.slug,n=a.split("/").filter(Boolean).slice(-1)[0],o=t.map((function(e){var t,o=l()(e,{lower:!0}),i=o===n,s=a.replace(n,o);return Object(r.b)("li",{key:e,className:p()((t={},t[j.selectedItem]=i,t),j.listItem)},Object(r.b)(v.Link,{className:j.link,to:""+s},e))}));return Object(r.b)("div",{className:j.tabsContainer},Object(r.b)("div",{className:"bx--grid"},Object(r.b)("div",{className:"bx--row"},Object(r.b)("div",{className:"bx--col-lg-12 bx--col-no-gutter"},Object(r.b)("nav",null,Object(r.b)("ul",{className:j.list},o))))))},n}(i.a.Component),k=a("MjG9");t.a=function(e){var t=e.pageContext,a=e.children,o=e.location,i=t.frontmatter,c=void 0===i?{}:i,u=t.relativePagePath,p=c.tabs,m=c.title,g=Object(b.c)(),f=!!p&&"down"===g,v=n.data.site.pathPrefix,j=v?o.pathname.replace(v,""):o.pathname,P=p?j.split("/").slice(-1)[0]||l()(p[0],{lower:!0}):"";return Object(r.b)(d.a,{shouldHideHeader:f,homepage:!1},Object(r.b)(x,{shouldHideHeader:f,title:m,label:"label",tabs:p},p&&Object(r.b)(H,{slug:j,tabs:p,currentTab:P})),Object(r.b)(k.a,{padded:!0},a,Object(r.b)(h,{relativePagePath:u})),Object(r.b)(O.a,{pageContext:t,location:o,slug:j,tabs:p,currentTab:P}),Object(r.b)(s.a,null))}},BAC9:function(e,t,a){e.exports={bxTextTruncateEnd:"EditLink-module--bx--text-truncate--end--2pqje",bxTextTruncateFront:"EditLink-module--bx--text-truncate--front--3_lIE",link:"EditLink-module--link--1qzW3",row:"EditLink-module--row--1B9Gk"}},I8xM:function(e,t,a){e.exports={bxTextTruncateEnd:"PageTabs-module--bx--text-truncate--end--267NA",bxTextTruncateFront:"PageTabs-module--bx--text-truncate--front--3xEQF",tabsContainer:"PageTabs-module--tabs-container--8N4k0",list:"PageTabs-module--list--3eFQc",listItem:"PageTabs-module--list-item--nUmtD",link:"PageTabs-module--link--1mDJ1",selectedItem:"PageTabs-module--selected-item--YPVr3"}},QH2O:function(e,t,a){e.exports={bxTextTruncateEnd:"PageHeader-module--bx--text-truncate--end--mZWeX",bxTextTruncateFront:"PageHeader-module--bx--text-truncate--front--3zvrI",pageHeader:"PageHeader-module--page-header--3hIan",text:"PageHeader-module--text--o9LFq",pageHeaderSticky:"PageHeader-module--page-header--sticky--1ElAE",pageHeaderShifted:"PageHeader-module--page-header--shifted--1sRXO"}},Z3H1:function(e){e.exports=JSON.parse('{"data":{"site":{"siteMetadata":{"repository":{"baseUrl":"https://github.com/IBM/FHIR","subDirectory":"/docs"}}}}}')},dKzy:function(e,t,a){"use strict";a.r(t),a.d(t,"_frontmatter",(function(){return i})),a.d(t,"default",(function(){return l}));a("E5k/"),a("rzGZ"),a("Dq+y"),a("8npG"),a("Ggvi"),a("qKvR"),a("q1tI");var r=a("E/Ix"),n=a("013z");function o(){return(o=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var r in a)Object.prototype.hasOwnProperty.call(a,r)&&(e[r]=a[r])}return e}).apply(this,arguments)}var i={},s={_frontmatter:i},c=n.a;function l(e){var t=e.components,a=function(e,t){if(null==e)return{};var a,r,n={},o=Object.keys(e);for(r=0;r<o.length;r++)a=o[r],t.indexOf(a)>=0||(n[a]=e[a]);return n}(e,["components"]);return Object(r.b)(c,o({},s,a,{components:t,mdxType:"MDXLayout"}),Object(r.b)("h3",{id:"license"},"License"),Object(r.b)("p",null,"FHIR® is the registered trademark of HL7 and is used with the permission of HL7."))}l.isMDXComponent=!0},pOBw:function(e){e.exports=JSON.parse('{"data":{"site":{"pathPrefix":"/FHIR"}}}')}}]);
//# sourceMappingURL=component---src-pages-template-mdx-b57209ec9ea4a60ae4af.js.map
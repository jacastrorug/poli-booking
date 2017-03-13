define(['jquery', 'underscore', 'backbone', 'App',
        'text!templates/usuario/gimnasio.html'],
    function ($, _, Backbone, App, gimnasio) {

        var gimnasioView = Backbone.View.extend({
            el: $("#page"),

            render: function () {

                $('.menu li').removeClass('active');
                $('.menu li a[href="#"]').parent().addClass('active');
                this.$el.html(gimnasio);
                App.lanzarEventoLoad();
            }

        });

        return gimnasioView;

    });

package com.ott.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMovie is a Querydsl query type for Movie
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMovie extends EntityPathBase<Movie> {

    private static final long serialVersionUID = -1790067087L;

    public static final QMovie movie = new QMovie("movie");

    public final StringPath companys = createString("companys");

    public final StringPath directors = createString("directors");

    public final StringPath genreAlt = createString("genreAlt");

    public final StringPath mNameko = createString("mNameko");

    public final StringPath mseq = createString("mseq");

    public final StringPath openDt = createString("openDt");

    public final StringPath prdtYear = createString("prdtYear");

    public final StringPath thumnail_path = createString("thumnail_path");

    public QMovie(String variable) {
        super(Movie.class, forVariable(variable));
    }

    public QMovie(Path<? extends Movie> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovie(PathMetadata metadata) {
        super(Movie.class, metadata);
    }

}

